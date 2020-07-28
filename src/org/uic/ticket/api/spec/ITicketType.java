/*
 *   This file was generated by openASN.1 - an open source ASN.1 toolkit for java
 *
 *   openASN.1 is Copyright (C) 2007 Clayton Hoss, Marc Weyland
 *
 *   openASN.1 is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as
 *   published by the Free Software Foundation, either version 3 of
 *   the License, or (at your option) any later version.
 *
 *   openASN.1 is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with openASN.1. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.uic.ticket.api.spec;

import net.gcdc.asn1.datatypes.HasExtensionMarker;

@HasExtensionMarker
public enum ITicketType {
		openTicket("openTicket"),
		pass("openTicket"),
		reservation("openTicket"),
		carCarriageReservation("carCarriageReservation");
		
		public String text;

		ITicketType(String text) {
			this.text = text;
		}
		
		public String toString(){
			return text;
		}			
}

