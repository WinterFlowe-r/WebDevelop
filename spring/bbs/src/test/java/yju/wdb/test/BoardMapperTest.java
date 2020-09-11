package yju.wdb.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import yju.wdb.domain.BoardVO;
import yju.wdb.domain.Criteria;
import yju.wdb.mapper.BoardMapper;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {
	Logger log = Logger.getLogger(BoardMapperTest.class);
	@Autowired
	private BoardMapper mapper;

	@Test
	public void testGetList() {
		mapper.getlist().forEach(board -> log.info(board));
		/*
			List<BoardVO> list = mapper.getList();
			for(int i=0; i<list.size(); i++)
				log.info(list.get(i));
		*/
	}
	
	//@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("���� �ۼ��ϴ� ��");
		vo.setContent("���� �ۼ��ϴ� ����");
		vo.setWriter("newbie");
		
		mapper.insert(vo);
		
		log.info(vo);
	}
	
	//@Test
	public void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("���� �ۼ��ϴ� �� select key");
		vo.setContent("���� �ۼ��ϴ� ���� select key");
		vo.setWriter("newbie");
		
		mapper.insertSelectKey(vo);
		
		log.info(vo);
	}
	
	//@Test
	public void testRead() {
		BoardVO board = mapper.read(3);
		
		log.info(board);
	}
	
	//@Test
	public void testDelete() {
		log.info("DELETE COUNT: " + mapper.delete(2));
	}
	
	//@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(1);
		vo.setTitle("���� �ۼ��ϴ� ��");
		vo.setContent("���� �ۼ��ϴ� ����");
		vo.setWriter("newbie");
		
		log.info("UPDATE COUNT: " + mapper.update(vo));
	}
	
	@Test
	public void testPaging() {
		Criteria crt = new Criteria();
//		crt.setKeyword("세로");
//		crt.setType("TC");
////		crt.setPageNum(1);
////		crt.setAmount(10);
		
		List<BoardVO> list = mapper.getListWithPaging(crt);
		list.forEach(board->log.info(board));
	}
	
	//@Test
	public void testPagingNSearch() {
		Criteria crt = new Criteria();
		crt.setKeyword("세로");
		crt.setType("TC");
		
		List<BoardVO> list = mapper.getListWithPaging(crt);
		list.forEach(board->log.info(board));
	}
}
