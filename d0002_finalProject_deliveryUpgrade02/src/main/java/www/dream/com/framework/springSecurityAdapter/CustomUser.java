package www.dream.com.framework.springSecurityAdapter;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import www.dream.com.party.model.Person;

/**
 * 본시스템 아키텍쳐는 스프링의 시큐리티 모듈을 활용하여 사용자 인증 및 권한을 처리 중입니다.
 * 하지만 이 아키텍쳐 선택을 바꿀 때 변경을 최소화 하기 위하여 Party Class와 연계 클래스를 정의함
 * @param username
 * @param password
 * @param authorities
 */
public class CustomUser extends User {
	private Person party;
	
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}
	public CustomUser(Person party) {
		this(party.getUserId(), party.getUserPwd(), party.getListAccountability());
		this.party = party;
	}
	
	public Person getCurUser() {
		return party;
	}
}
