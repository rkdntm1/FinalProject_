package www.dream.com.party.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 시스템 운영자
 * @author ivarBae
 */
@Data
@NoArgsConstructor
public class Post extends Party {
	public Post(String userId) {
		super(userId);
	}

}
