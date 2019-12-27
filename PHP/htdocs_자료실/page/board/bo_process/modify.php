<!--- 게시글 수정 -->
<?php 
    include $_SERVER['DOCUMENT_ROOT']."/db.php";
    include $_SERVER['DOCUMENT_ROOT']."/include/header.php";
   
	$bno = $_GET['idx'];
	$sql = mq("select * from free_board where idx='$bno';");
	$board = $sql->fetch_array();
 ?>
<div id="sub_visual"></div>
<div id="sub_main">
    <div id="board_write">
        <h1><a href="/">자유게시판</a></h1>
        <h4>글을 수정합니다.</h4>
            <div id="write_area">
                <form action="modify_ok.php/<?php echo $board['idx']; ?>" method="post">
                    <input type="hidden" name="idx" value="<?=$bno?>" />
                    <div id="in_title">
                        <textarea name="title" id="utitle" rows="1" cols="55" placeholder="제목" maxlength="100" required><?php echo $board['title']; ?></textarea>
                    </div>
                    <div class="wi_line"></div>
                    <div id="in_name">
                        <textarea name="name" id="uname" rows="1" cols="55" placeholder="글쓴이" maxlength="100" required><?php echo $board['name']; ?></textarea>
                    </div>
                    <div class="wi_line"></div>
                    <div id="in_content">
                        <textarea name="content" id="ucontent" placeholder="내용" required><?php echo $board['content']; ?></textarea>
                    </div>
                    <div id="in_pw">
                        <input type="password" name="pw" id="upw"  placeholder="비밀번호" required />  
                    </div>
                    <div id="in_lock">
                        <input type="checkbox" value="1" name="lockpost" /> 비밀글입니다.
                    </div>
                    <div class="bt_se">
                        <button type="submit">글 작성</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
<?php include $_SERVER['DOCUMENT_ROOT']."/include/footer.php"; ?>