package www.dream.com.bulletinBoard.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.NoArgsConstructor;
import www.dream.com.common.attachFile.model.AttachFileVO;
import www.dream.com.framework.langPosAnalyzer.HashTarget;
import www.dream.com.framework.printer.ClassPrintTarget;
import www.dream.com.framework.printer.PrintTarget;
import www.dream.com.framework.util.ToStringSuperHelp;
import www.dream.com.hashTag.model.IHashTagOpponent;
import www.dream.com.party.model.Party;
/**
 * 게시글
 * @author ivarBae
 */
@Data
@NoArgsConstructor
@ClassPrintTarget
public class PostVO extends ReplyVO implements IHashTagOpponent {
	public static final String DESCRIM4POST = "post";
	
	@HashTarget 
	private String title;
	@PrintTarget(order=300, caption="조회수")
	private int readCnt;
	private int likeCnt;	//좋아요
	private int dislikeCnt;	//싫어요
	private String location;
	
	private List<String> listAttachInStringFormat;
	private List<AttachFileVO> listAttach;
	private List<MenuPoint> listMenu = new ArrayList<>();;
	
	public PostVO(String title, String content, Party writer) {
		super(content, writer);
		this.title = title;
	}
	
	public String getType() {
		return "Post";
	}
	
	@PrintTarget(order=100, caption="제목", withAnchor=true)
	public String getTitleWithCnt() {
		return title + "[" + super.replyCnt + "]";
	}
	
	
	public List<String> getAttachListInGson(){
		List<String> ret = new ArrayList<>();
		ret.addAll(listAttach.stream().map(vo->vo.getJson()).collect(Collectors.toList()));
		return ret;
	}
	
	public void parseAttachInfo() {
		if(listAttach == null || listAttach.isEmpty()) {
			listAttach = new ArrayList<>();
		}
		if(listAttachInStringFormat != null) {
			for(String ai : listAttachInStringFormat ) {
				listAttach.add(AttachFileVO.fromJson(ai));
			}
		}
	}
	
	@Override
	public String toString() {
		return "PostVO [" + ToStringSuperHelp.trimSuperString(super.toString()) 
		+ ", title=" + title + ", readCnt=" + readCnt + ", likeCnt=" + likeCnt 
		+ ", dislikeCnt=" + dislikeCnt + "]";
	}

}
