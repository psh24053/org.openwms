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
package assets
{

    [Bindable]
    public class Assets
    {
        public function Assets()
        {
        }

        [Embed(source="/resources/assets/images/pinvoke/user-add.png")]
        public static var userAdd:Class

        [Embed(source="/resources/assets/images/pinvoke/user--delete.png")]
        public static var userDelete:Class

        [Embed(source="/resources/assets/images/pinvoke/users-add.png")]
        public static var usersAdd:Class

        [Embed(source="/resources/assets/images/pinvoke/users-delete.png")]
        public static var usersDelete:Class
    }
}