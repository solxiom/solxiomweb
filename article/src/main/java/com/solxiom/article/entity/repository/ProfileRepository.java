/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solxiom.article.entity.repository;

import com.solxiom.article.entity.Profile;

/**
 *
 * @author soleikav
 */
public interface ProfileRepository extends AbstractCrudRepository<Profile> {
    public Profile loadByFacebookId(String facebookId);

}
