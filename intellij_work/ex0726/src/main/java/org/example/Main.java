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
    public static void newCommand(MemberDto dto){
        MemberService memberService = acac.getBean(MemberService.class);
        try{
            memberService.regist(dto);
        }catch (Exception e){
            System.out.println("email 중복,입력 불가.");
        }

    }
    private static void updatecommand(String email, String oldpwd, String newpwd) {
        MemberService memberService =  acac.getBean(MemberService.class);
        try{
            memberService.change( );
        }catch (Exception e){
            System.out.println("pwd");
        }

    }


    public static void main(String[] args) throws IOException {


        System.out.println("Hello world!");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 사용자로부터 입력받기우해

        acac = new AnnotationConfigApplicationContext(ClassConfig.class); //객체담는 통 생성 ()걸로 만들어진다, 스프링컨테이너 생성

        try {
            while (true) {
                System.out.println("1. list 2.new 3.update 4.Exit");
                String cmd = br.readLine();
                if(cmd.equalsIgnoreCase("list")){//대소문자 관계없이 확인
                    listCommand(); // 리스트출력
                }
                else if(cmd.startsWith("new")){// new로 시작하는
                    //입력
                    //new aa@naver.com 김길동 1234
                    //new aa@naver.com  1234
                    try {
                        String email = cmd.split(" ")[1];
                        String name = cmd.split(" ")[2];
                        String pwd = cmd.split(" ")[3];
                        MemberDto md = new MemberDto(name, email, pwd);
                        newCommand(md);
                    }catch(IndexOutOfBoundsException ie){
                        System.out.println("new aa@naver.com 김길동 1234 \n이렇게 입력하세요");
                    }
                }
                else if (cmd.startsWith("update")){
                    //update aa@naver.com 1234 5678
                    try{
                        String email = cmd.split(" ")[1];
                        String oldpwd = cmd.split(" ")[2];
                        String newpwd = cmd.split(" ")[3];
                        updatecommand(email, oldpwd, newpwd);
                    }catch (Exception e){
                        System.out.println("update aa@naver.com 1234 1234 \n이렇게 입력하세요");
                        System.out.println(e.toString());
                    }
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
