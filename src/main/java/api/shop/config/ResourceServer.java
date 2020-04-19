/**
 * 
 */
package api.shop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

/**
 * @author suhada
 *
 */
@Configuration
public class ResourceServer extends ResourceServerConfigurerAdapter{

	@Override
    public void configure(HttpSecurity http) throws Exception {
        http
        .cors()
        .and()
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        .authorizeRequests()
        	.antMatchers("/test2/**").permitAll()
        	.antMatchers("/apishop/common/labelpack/**","/apiauth/**").permitAll()
        	.antMatchers("/actuator/**").permitAll()
        	.anyRequest().authenticated()
        .and()
        .exceptionHandling()
        	.accessDeniedHandler(new OAuth2AccessDeniedHandler());
    }
	
}
