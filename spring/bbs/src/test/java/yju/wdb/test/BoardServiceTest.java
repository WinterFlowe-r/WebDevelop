package yju.wdb.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import yju.wdb.domain.BoardVO;
import yju.wdb.domain.Criteria;
import yju.wdb.mapper.BoardMapper;
import yju.wdb.service.BoardService;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTest {
	Logger log = Logger.getLogger(BoardServiceTest.class);
	@Autowired
	private BoardService service;
	@Autowired
	private BoardMapper mapper;
	
	//@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
	//@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("New article");
		board.setContent("New Content");
		board.setWriter("Seungwoo");
		
		service.register(board);
		
		log.info("������ �Խñ��� ��ȣ : " + board.getBno());
	}
	
	//@Test
	public void testGetList() {
		//service.getList().forEach(board -> log.info(board));
		service.getList(new Criteria(2,10)).forEach(board->log.info(board.toString()));
	}
	
//	@Test
//	public void testGet() {
//		log.info(service.get(4));
//	}
	
	@Test
	public void testPaging() {
		Criteria crt = new Criteria();
		crt.setPageNum(2);
		crt.setAmount(10);
		
		List<BoardVO> list = mapper.getListWithPaging(crt);
		list.forEach(board->log.info(board));
	}
	
}
