package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static AnnotationConfigApplicationContext acac = null;
    public static void listCommand(){
        MemberService memberService = acac.getBean(MemberService.class);
        memberService.list(); //list호출
    }

    public static void main(String[] args) throws IOException {


        System.out.println("Hello world!");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        acac = new AnnotationConfigApplicationContext(ClassConfig.class); //객체담는 통 생성 ()걸로 만들어진다, 스프링컨테이너 생성

        try {
            while (true) {
                System.out.println("1. list 2. new aa@naver.com 3. Exit");
                String cmd = br.readLine();
                if(cmd.equalsIgnoreCase("list")){//대소문자 관계없이 확인
                    listCommand(); // 리스트출력
                }
                else if(cmd.startsWith("new ")){// new로 시작하는
                    //입력
                }
                else if(cmd.equalsIgnoreCase("exit")){
                    System.out.println("종료됩니다");
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace(); //예외발생시 출력
        }
        finally {
            acac.close(); // 스프링 컨테이너 무너뜨려
        }
//        MemberDao dao = acac.getBean(MemberDao.class);

//        System.out.println(dao); //dao의 주소값

//        dao.selectAll();
//        dao.insert(new MemberDto("홍길동", "aaa@naver.com", "1234"));
//        dao.selectAll();
//        dao.insert(new MemberDto("박길동", "bbb@naver.com", "1234"));
//        dao.selectAll();




    }
}