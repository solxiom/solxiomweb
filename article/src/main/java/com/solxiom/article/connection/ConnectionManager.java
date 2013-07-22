/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solxiom.article.connection;

import com.solxiom.article.connection.exception.InvalidConnectionCredentialException;
import com.solxiom.article.connection.exception.NullAccessGrantException;
import com.solxiom.article.connection.exception.NullActiveConnectionException;
import com.solxiom.article.connection.config.LoggingPolicy;
import com.solxiom.article.connection.entity.CachedRequest;
import com.solxiom.article.connection.entity.ConnectionCredential;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.oauth2.AccessGrant;

/**
 *
 * @author soleikav
 */
public interface ConnectionManager {

	public CachedRequest requireLogin(HttpServletRequest request,
			HttpServletResponse response);

	public void connect(HttpServletRequest request, HttpServletResponse response)throws InvalidConnectionCredentialException,
	NullActiveConnectionException, NullAccessGrantException;
	
	public void setConnectionCredential(ConnectionCredential credential)
			throws InvalidConnectionCredentialException;

	public ConnectionCredential getConnectionCredential();

	public List<String> getConnectionLog();

	public AccessGrant getSessionFacebookAccessGrant(String session_id);

	public String disconnect(HttpServletRequest request,
			HttpServletResponse response);

	public String disconnect(HttpServletRequest request,
			HttpServletResponse response, boolean facebook_logout);

	public Facebook getSessionFacebook(String session_id);

	public boolean isUserLoggedIn(String session_id);
	
	public LoggingPolicy getLoggingPolicy();

	public void setLoggingPolicy(LoggingPolicy policy);
	
	public void setRedirectUrl(HttpServletRequest request, String url);
	
	public String getRedirectUrl(HttpServletRequest request);
	

}
