package org.practice.web2.service;

import com.example.dto.StoreDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StroeService {

public enum StoreService {//enum = 객체의 수를 제한 내가 필요한 만큼의 객체를 만들때 쓸 수 있음.


    INSTANCE;//enum은 대문자로 정의

    private List<StoreDTO> dtoList;

    StoreService() {//enum의 생성자는 public을 제거 가능(이미 객체 갯수를 정해놨기 때문에 public로 외부접근 필요x
        dtoList = new ArrayList<>();

        this.add(StoreDTO.builder().name("수정식당").area("종각").desc("불백").build());
        this.add(StoreDTO.builder().name("창매족").area("석계").desc("족발").build());
        this.add(StoreDTO.builder().name("아리닭발").area("김포").desc("닭발").build());
        this.add(StoreDTO.builder().name("은행나무집").area("종각").desc("한우국밥").build());


    }

    public void add(StoreDTO storeDTO) {
        this.dtoList.add(storeDTO);//storeDTO배열의 값을 받아 dtolist를 참조하는 add()에 담아준다.
    }

    public List<StoreDTO> getDtoList(String area) { //String area값을 받아 if문을 실행시킨다.

        if (area == null || area.trim().length() == 0) {//area안에 들은 값이 null 혹은 공백을 없앤게 0이면
            return this.dtoList;//dtolist를 리턴한다.
        }
        //람다식으로 area의 입력값을 필터링해서 목록을 보여준다.
        return this.dtoList.stream().filter(storeDTO -> storeDTO.getArea().equals(area))
                .collect(Collectors.toList());

    }


}
}