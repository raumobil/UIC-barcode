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
package org.uic.ticket.api.asn.omv2;

import java.util.List;

import net.gcdc.asn1.datatypes.Asn1Optional;
import net.gcdc.asn1.datatypes.CharacterRestriction;
import net.gcdc.asn1.datatypes.FixedSize;
import net.gcdc.asn1.datatypes.HasExtensionMarker;
import net.gcdc.asn1.datatypes.RestrictedString;
import net.gcdc.asn1.datatypes.Sequence;

@Sequence
@HasExtensionMarker
public class TravelerData extends Object {
	public TravelerData() {
	}

	@Asn1Optional public SequenceOfTravelerType traveler;
	
	@RestrictedString(CharacterRestriction.IA5String)
	@FixedSize(2)
	@Asn1Optional public String preferedLanguage;

	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String groupName;
	
	
	public List<TravelerType> getTraveler() {

		return this.traveler;
	}

	public String getPreferedLanguage() {

		return this.preferedLanguage;
	}

	public String getGroupName() {

		return this.groupName;
	}

	public void setTraveler(SequenceOfTravelerType traveler) {

		this.traveler = traveler;
	}

	public void setPreferedLanguage(String preferedLanguage) {

		this.preferedLanguage = preferedLanguage;
	}

	public void setGroupName(String groupName) {

		this.groupName = groupName;
	}



}
