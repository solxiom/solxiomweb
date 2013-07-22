/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solxiom.article.connection.config;

import com.solxiom.article.connection.entity.ConnectionCredential;

/**
 *
 * @author soleikav
 */
public interface ConnectionConfig {

	 ConnectionCredential buildDefaultConnectionCredential();
	 LoggingPolicy getDefaultLoggingPolicy();
}
