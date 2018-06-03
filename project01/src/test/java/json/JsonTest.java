package json;


import json.model.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by jhcorea on 2018. 6. 2..
 */
public class JsonTest {

    ObjectMapper mapper;

    @Before
    public void setup(){
        mapper = new ObjectMapper();
    }

    /**
     * serialize 테스트
     * @throws JsonProcessingException
     */
    @Test
    public void 기본테스트01() throws JsonProcessingException{

        /**
         * 성공, getter, setter 기준으로 실행
         */
        System.out.println(mapper.writeValueAsString(new ExampleModel()));

        /**
         * com.fasterxml.jackson.databind.JsonMappingException: No serializer found for class json.model.ExampleModel2 and no properties discovered to create BeanSerializer
         */
        System.out.println(mapper.writeValueAsString(new ExampleModel2()));
    }

    /**
     * @throws JsonProcessingException
     */
    @Test
    public void JsonProperty테스트() throws JsonProcessingException{

        System.out.println(mapper.writeValueAsString(new ExampleModel2_2()));

        System.out.println(mapper.writeValueAsString(new ExampleModel3()));

        /**
         * com.fasterxml.jackson.databind.JsonMappingException: Conflicting getter definitions for property "appleA": json.model.ExampleModel3_2#getAppleA(0 params) vs json.model.ExampleModel3_2#getApple(0 params)
         */
        System.out.println(mapper.writeValueAsString(new ExampleModel3_2()));

        /***
         * 결론
         * JsonProperty 어노테이션의 value 기준으로 key값을 생성하고 value 는 getter를 통해서 가져온다.
         * 이때 getter 명칭은 get[value]() 혹은 get[member variable name] 중 있는 것을 사용한다
         * 따라서 3번째 모델처럼 만들어놓으면 예외가 발생한다.
         * 1번째 모델처럼 getter, setter가 없으면 해당 값을 가져온다.
         *
         * 그닥 필요없는 내용 같음
         */

    }

    /**
     * deserialize 테스트
     * @throws JsonProcessingException
     */
    @Test
    public void 기본테스트02() throws JsonProcessingException{

    }

}


