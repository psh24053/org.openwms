/*
 * openwms.org, the Open Warehouse Management System.
 *
 * This file is part of openwms.org.
 *
 * openwms.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * openwms.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.openwms.core.rest.user;

import java.io.Serializable;
import java.util.Set;

/**
 * A RoleDTO.
 * 
 * @author <a href="mailto:scherrer@openwms.org">Heiko Scherrer</a>
 * @version $Revision: $
 * @since 0.1
 */
public class RoleDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Get the immutable.
     * 
     * @return the immutable.
     */
    public Boolean getImmutable() {
        return immutable;
    }

    /**
     * Set the immutable.
     * 
     * @param immutable
     *            The immutable to set.
     */
    public void setImmutable(Boolean immutable) {
        this.immutable = immutable;
    }

    /**
     * Get the users.
     * 
     * @return the users.
     */
    public Set<UserVO> getUsers() {
        return users;
    }

    /**
     * Set the users.
     * 
     * @param users
     *            The users to set.
     */
    public void setUsers(Set<UserVO> users) {
        this.users = users;
    }

    /**
     * Get the name.
     * 
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name.
     * 
     * @param name
     *            The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the description.
     * 
     * @return the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description.
     * 
     * @param description
     *            The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the grants.
     * 
     * @return the grants.
     */
    public Set<SecurityObjectVO> getGrants() {
        return grants;
    }

    /**
     * Set the grants.
     * 
     * @param grants
     *            The grants to set.
     */
    public void setGrants(Set<SecurityObjectVO> grants) {
        this.grants = grants;
    }

    private Boolean immutable;
    private String name;
    private String description;
    private Set<UserVO> users;
    private Set<SecurityObjectVO> grants;
}
