package www.dream.com.delivery.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import www.dream.com.delivery.model.DeliveryRequestVO;
import www.dream.com.party.model.Party;

public interface DeliveryMapper {
	
	//List
	public List<DeliveryRequestVO> getList(@Param("boardId") int boardId);
	
	
	public List<DeliveryRequestVO> searchRequest(@Param("curUser") Party curUser, 
			@Param("radiusLatitude")double radiusLatitude, @Param("radiusLongitude") double radiusLongitude); 
	
	
	/** id 값으로 Post 객체 조회 */
	public int insertRequest(@Param("requestId") String requestId, @Param("request")  DeliveryRequestVO request);

	public DeliveryRequestVO findRequestById(String reqId);

	public DeliveryRequestVO updateRequest(DeliveryRequestVO request);
	
	
	//**********************************************************************************************************************************************
	
	//LRCUD
		/** -------------- 게시글 처리 함수 정의 영역  --------------------- */
	//public long getTotalCount(@Param("boardId") int boardId, @Param("descrim") String descrim);
	//public long getSearchTotalCount(@Param("boardId") int boardId, @Param("cri") Criteria cri);
		
		/* mapper 함수의 인자 개수가 여러개 일 때는 필수적으로 @Param을 넣어야 합니다
		 * 이를 실수하지 않기 위하여 한개여도 그냥 명시적으로 넣어 주세요 */
		/* 초기 화면 띄울 때 활용 : 최종적으로는 개인화 서비스에서 초기화면으로 활용 */
	//public List<PostVO> getList(@Param("boardId") int boardId, @Param("cri") Criteria cri);
	//public List<PostVO> getListByHashTag(@Param("boardId") int boardId, @Param("cri") Criteria cri);
		/** hashTag 검색 개인화 */
	//public List<PostVO> getFavorite(@Param("boardId") int boardId, @Param("curUser") Party curUser);
		/** id 값으로 Post 및 Reply, Reply of Reply 객체 조회 */
	//public ReplyVO findReplyById(String id);
		/** 게시글 등록 */
	//public int insert(@Param("board") BoardVO board, @Param("post") PostVO post);

		/** 게시글 수정 처리 */
	//public int updatePost(PostVO post);
		
		/** id 값으로 Post 객체 삭제 */
	//public int deleteReplyById(String id);

		/** -------------- 댓글 처리 함수 정의 영역  --------------------- */
	//public int getAllReplyCount(@Param("replyId") String replyId, @Param("idLength") int idLength);
		
	//		public int getReplyCount(@Param("originalId") String originalId, @Param("idLength") int idLength);
		
	//		public List<ReplyVO> getReplyListWithPaging(@Param("originalId") String originalId, @Param("idLength") int idLength, @Param("cri") Criteria cri);
		
		/** 특정 댓글의 모든 후손 대댓글을 작성 순서에 따라 조회해 줍니다. */
	//		public List<ReplyVO> getReplyListOfReply(@Param("originalId") String originalId, @Param("idLength") int idLength);
		
		/** id 값으로 Post 객체 조회 */
	//public int insertReply(@Param("originalId") String originalId, @Param("reply") ReplyVO reply);
		
		/** 댓글 수정 처리 */
	//public int updateReply(ReplyVO reply);
		
		
}
