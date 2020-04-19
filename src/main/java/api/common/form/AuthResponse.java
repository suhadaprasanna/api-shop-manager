/**
 * 
 */
package api.common.form;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suhada
 *
 */
public class AuthResponse {

	private String jwt;
	private List<String> error_list= new ArrayList<>();
	
	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public List<String> getError_list() {
		return error_list;
	}

	public void setError_list(List<String> error_list) {
		this.error_list = error_list;
	}
	public void addError(String error) {
		this.error_list.add(error);
	}
}
