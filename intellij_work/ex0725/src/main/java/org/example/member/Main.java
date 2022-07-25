package org.example.member;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String,MemberDTO> memberlist = new HashMap<>();

    private static AnnotationConfigApplicationContext ctx = null;

    public static void main(String[] args) throws Exception { // 예외처리

        MemberDTO md = new MemberDTO("aa@naver.com", "홍길동", "1234"); // 객체가 3개인 생성자 생성
        memberlist.put("홍길동",md);

        MemberDTO md1 = new MemberDTO("bb@naver.com", "이길동", "1234"); // 객체가 3개인 생성자 생성
        memberlist.put("이길동",md1);

        ctx = new AnnotationConfigApplicationContext(Config.class); //객체담는 통을 만들어 config에 있는 내용으로

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //콘솔창에서 내용 읽어오겠다

        System.out.println("1.회원가입 new aaa@naver.com 이름 1234");
        System.out.println("2.회원리스트 list");
        System.out.println("3.회원삭제 del 이름");
        System.out.println("4.종료 exit");

        while(true) {
            String command = br.readLine(); //  br함수 안에 한줄을 들고와서
            if(command.equalsIgnoreCase("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if(command.startsWith("new ")){ // new로 시작하게 되면 공백은 필수x
                String name= command.split(" ")[1]; //빈공백을 기준으로 잘라 그중에 [1]번째 배열에 넣어
                MemberDTO md2 = new MemberDTO("bb@naver.com", name, "1234"); // 객체가 3개인 생성자 생성
                memberlist.put(name,md2);
                System.out.println("등록되었습니다.");

            }
            else if (command.equalsIgnoreCase("list")){
                MemberDAO dao = ctx.getBean(MemberDAO.class); // 객체담는 통에서 그중에서 dao를 들고나와
                Collection<MemberDTO> collection = dao.selectAll();
                collection.forEach(m-> System.out.println(m)); // print로 추력하면 1줄로 출력
            }

        }

//        System.out.println(memberlist);




    }
}
