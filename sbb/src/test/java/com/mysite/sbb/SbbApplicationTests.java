package com.mysite.sbb;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.transaction.Transactional;

@SpringBootTest
class SbbApplicationTests {

	@Autowired    //객체 자동 주입 , JPA의 CRUD할수 있는 메소드가 적용되어 있음. 
	private QuestionRepository questionRepository; 


	@Autowired    //객체 자동 주입 , JPA의 CRUD할수 있는 메소드가 적용되어 있음. 
	private AnswerRepository answerRepository; 

	/*하나의 질문에 여러개 답변 찾기*/
//	@Transactional //아래의 메소드가 하나의 트랜잭션으로 작동되도록 설정 ( test에서만 적용)
//	@Test
//	public void testjpa8() {
//		//1. question 테이블에서 질문의 레코드를 얻어온다. 
//		Optional<Question> op= this.questionRepository.findById(1);
//		
//		Question q=null;
//		if(op.isPresent()) {
//			q=op.get();
//		}
//		//2. 꺼내온  객체의 답변글을 가져옴 q.getAnserList()
//		//Question 객체의 answerList 칼럼은 List<answer>
//		List<Answer> all = q.getAnswerList(); //트랜잭션 끊김                                                                                                                                                 
//		//3. 출력구문에서 출력
//		for (int i=0;i<all.size();i++) {
//			Answer a = all.get(i);
//			System.out.println(a.getId());
//			System.out.println(a.getContent());
//			System.out.println(a.getCreateDate());
//			System.out.println("==================");
//		}
//	}
	
	
	/*답변레코드 하나 가져오기*/
//
//	@Test
//	public void testjps7() {
//		Optional<Answer> op=
//				this.answerRepository.findById(1);
//		if(op.isPresent()) {	//null이면 false , !null일때 true
//			Answer a = op.get();
//			System.out.println(a.getId());
//			System.out.println(a.getContent());
//			System.out.println(a.getCreateDate());
//			System.out.println(a.getQuestion());
//		}
//
//	}
//	
	/* Answer 테이블에 Insert 처리 */ 
//	@Test
//	public void testAnswerjpa() {
//		// 1. Question (부모) 테이블의 답변을 처리할 레코드를 먼저 select 한다. findById(1)
//		Optional <Question> op = 
//				this.questionRepository.findById(1);
//		Question q = op.get(); 
//		
//		// 2. Answer 엔티티 테이블의 객체 생성을 하고, setter 를 사용해서 값을 넣는다. 
//		//		setQuestion (q) 
//		Answer a = new Answer(); 
//		a.setQuestion(q);
//		a.setContent("3 - sbb답변 입니다.  " );
//		a.setCreateDate(LocalDateTime.now());	
//		
//		// 3. save 메소드를 사용해서 저장 
//		this.answerRepository.save(a);
//	}
////	
	/* 데이터 삭제	*/
//	@Test
//	public void testjpa6 () {
//		//1. 테이블에서 삭제할 레코드를 가지고 옮 
//		Optional<Question> op = 
//				this.questionRepository.findById(2); 
//		//2. Optional 에 저장된 객체를 끄집어 낸다. 
//		Question q = op.get(); 	
//		//3. delete(q)
//		this.questionRepository.delete(q);
//	}

	/*데이터 수정*/
//	@Test
//	public void testjpa5() {
//		//1. 수정할 객체를 findById() 메소드를 사용해서 가지고 온다. 
//		Optional<Question> op = 
//				this.questionRepository.findById(1);  
//		//2. 가지고온 객체를 끄집어내서 setter를 사용해서 수정 
//		Question q = op.get(); 
//		q.setSubject("수정된 제목");
//		q.setContent("수정된 내용");
//		//3. 수정된 객체를 save(q)
//		this.questionRepository.save(q);	
//	}
//	
	
	
	/*테이블의 모든 레코드 정렬 : asc, desc */
//	@Test
//	public void testjpa4 () {
//		List<Question> all =
//				this.questionRepository.findAllByOrderByCreateDateAsc(); 
//		List<Question> all2 =
//				this.questionRepository.findAllByOrderByCreateDateDesc(); 
//		
//		
//		System.out.println("총 리스트에 있는 객체수 : " + all.size());
//		System.out.println("======ASC 정렬후 출력 ==============");
//		for ( int i = 0 ; i < all.size() ; i++) {
//			Question q = all.get(i); 
//			
//			System.out.println(q.getId());
//			System.out.println(q.getSubject());
//			System.out.println(q.getContent());
//			System.out.println(q.getCreateDate());
//			System.out.println("================");
//		}
//		
//		System.out.println("====DESC 정렬후 출력==============================");
//		for ( int i = 0 ; i < all2.size() ; i++) {
//			Question q = all2.get(i); 
//			
//			System.out.println(q.getId());
//			System.out.println(q.getSubject());
//			System.out.println(q.getContent());
//			System.out.println(q.getCreateDate());
//			System.out.println("================");
//		}
//	}
//	
	
	
	/* 특정 조건으로 검색 후 정렬해서 출력*/
//	@Test
//	public void testjpa3() {
//		List<Question> or = 
//		this.questionRepository.findBySubjectLikeOrderByCreateDateAsc("%sbb%");
//		
//		List<Question> or2 = 
//				this.questionRepository.findBySubjectLikeOrderByCreateDateDesc("%sbb%");
//				
//		
//		
//		System.out.println("검색된 레코드수 :  " + or.size());
//		System.out.println("========== ASC : 오름 차순 정렬===================== ");
//		for ( int i = 0 ; i < or.size(); i++) {
//		Question q = or.get(i); 
//		
//		System.out.println(q.getId());
//		System.out.println(q.getSubject());
//		System.out.println(q.getCreateDate());
//		System.out.println("============================");
//		}
//		
//		System.out.println("=======DESC : 내림차순 정렬======================");
//		
//		for ( int i = 0 ; i < or.size(); i++) {
//		Question q = or2.get(i); 
//		
//		System.out.println(q.getId());
//		System.out.println(q.getSubject());
//		System.out.println(q.getCreateDate());
//		System.out.println("============================");
//		}
//
//		for (Question q : or) {
//			System.out.println(q);
//		}
//		
//	}
	
//	두컬럼을 'or' 연산으로 검색 : subject , content 
//	@Test
//	public void testjpa2() {
//		List<Question> sq = 
//		this.questionRepository.findBySubjectLikeOrContentLike("%sbb%", "%생성%"); 
//		
//		Question q4 = sq.get(0); 
//		System.out.println("총 검색된 갯수 : " + sq.size());
//		System.out.println(q4.getId());
//		System.out.println(q4.getSubject());
//		System.out.println(q4.getContent());
//	}
//	
//	사용자 정의 select 문 : subject 컬럼, content 컬럼 검색 , Like 
//	@Test
//	public void testjpa () {
//		
//		List<Question> all = this.questionRepository.findBySubjectLike("%sbb%"); 
//		
//		Question q = all.get(0); 
//		System.out.println("리스트에 검색된 레코드수 : " + all.size());
//		System.out.println(q.getId());
//		System.out.println(q.getSubject());
//		System.out.println(q.getContent()); 
//		
//		System.out.println("=======================");
//		
//		List<Question> all2 = this.questionRepository.findByContentLike("%생성%");
//		
//		Question q3 = all2.get(0); 
//		
//		System.out.println("리스트에 검색된 레코드수 : " + all.size());
//		System.out.println(q3.getId());
//		System.out.println(q3.getSubject());
//		System.out.println(q3.getContent()); 	
//	}
//	
	
//	조건에 맞는 레코드 하나만 가져 오기  : PK 컬럼은 findById(1) 
//	Question 테이블의 Primary Key 컬럼은 기본적으로 제공됨 : findById (1)
//	@Test
//	public void jpaTestget () {
//		Optional<Question> oq = this.questionRepository.findById(2); 
//		if (oq.isPresent()) {
//			Question q = oq.get(); 
//			System.out.println(q.getId());
//			System.out.println(q.getSubject());
//			System.out.println(q.getContent());
//			System.out.println(q.getCreateDate());
//		}
//	}
	
//	데이터 전체 가져와서비교(assertEquals)
//	@Test
//	public void compare() {
//		
//		List<Question> all = this.questionRepository.findAll(); 
//		//assertEquals(2, all.size());   // assertEquals( 기대값, 실제값)  , 성공 (두값 이일치)	
//		
//		Question q = all.get(0); 	// List all 변수에 담긴 0번방의 Question 객체를 끄집어낸다. 
//		//assertEquals("sbb가 무엇인가요",q.getSubject() );  //성공 
//		
//		System.out.println(q.getId());
//		System.out.println(q.getSubject());
//		System.out.println(q.getContent());
//		
//	}
	
//	테이블 행 추가 (insert)
//	@Test
//	void createcol() {
//		Question q1 = new Question(); 
//		q1.setSubject("sbb가 무엇인가요");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());   // 현재 시간을 setter에 저장 
//		this.questionRepository.save(q1);  	//첫번째 질문 저장 
//		
//		Question q2 = new Question(); 
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요. ");
//		q2.setCreateDate(LocalDateTime.now());   // 현재 시간을 setter에 저장 
//		this.questionRepository.save(q2); 
//	}

}
