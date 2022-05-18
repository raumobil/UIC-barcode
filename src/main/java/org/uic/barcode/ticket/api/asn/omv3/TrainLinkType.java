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
package org.uic.barcode.ticket.api.asn.omv3;

import java.util.Date;

import org.uic.barcode.asn1.datatypes.Asn1BigInteger;
import org.uic.barcode.asn1.datatypes.Asn1Optional;
import org.uic.barcode.asn1.datatypes.CharacterRestriction;
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.IntRange;
import org.uic.barcode.asn1.datatypes.RestrictedString;
import org.uic.barcode.asn1.datatypes.Sequence;
import org.uic.barcode.ticket.api.utils.DateTimeUtils;

@Sequence
public class TrainLinkType extends Object {
	public TrainLinkType() {
	}

	@FieldOrder(order = 0)
	@Asn1Optional public Asn1BigInteger trainNum;

	@FieldOrder(order = 1)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String trainIA5;

	@FieldOrder(order = 2)
	@IntRange(minValue=-1,maxValue=500)
	public Long travelDate;

	@FieldOrder(order = 3)
	@IntRange(minValue=0,maxValue=1440)
	public Long departureTime;
	
	@FieldOrder(order = 4)
	@IntRange(minValue=-60, maxValue=60)
	@Asn1Optional public Long departureUTCOffset;

	@FieldOrder(order = 5)
	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long fromStationNum;

	@FieldOrder(order = 6)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String fromStationIA5;

	@FieldOrder(order = 7)
	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long toStationNum;

	@FieldOrder(order = 8)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String toStationIA5;

	@FieldOrder(order = 9)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String fromStationName;

	@FieldOrder(order = 10)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String toStationName;

	public Long getTrainNum() {
		return Asn1BigInteger.toLong(this.trainNum);
	}

	public String getTrainIA5() {
		return this.trainIA5;
	}

	public Long getTravelDate() {
		return this.travelDate;
	}

	public Long getDepartureTime() {
		return this.departureTime;
	}
	
	

	public Long getDepartureUTCOffset() {
		return departureUTCOffset;
	}

	public void setDepartureUTCOffset(Long departureUTCOffset) {
		this.departureUTCOffset = departureUTCOffset;
	}

	public Long getFromStationNum() {
		return this.fromStationNum;
	}

	public String getFromStationIA5() {
		return this.fromStationIA5;
	}

	public Long getToStationNum() {
		return this.toStationNum;
	}

	public String getToStationIA5() {
		return this.toStationIA5;
	}

	public String getFromStationName() {
		return this.fromStationName;
	}

	public String getToStationName() {
		return this.toStationName;
	}

	public void setTrainNum(Long trainNum) {
		this.trainNum = Asn1BigInteger.toAsn1(trainNum);
	}

	public void setTrainIA5(String trainIA5) {
		this.trainIA5 = trainIA5;
	}

	public void setTravelDate(Long travelDate) {
		this.travelDate = travelDate;
	}

	public void setDepartureTime(Long departureTime) {
		this.departureTime = departureTime;
	}

	public void setFromStationNum(Long fromStationNum) {
		this.fromStationNum = fromStationNum;
	}

	public void setFromStationIA5(String fromStationIA5) {
		this.fromStationIA5 = fromStationIA5;
	}

	public void setToStationNum(Long toStationNum) {
		this.toStationNum = toStationNum;
	}

	public void setToStationIA5(String toStationIA5) {
		this.toStationIA5 = toStationIA5;
	}

	public void setFromStationName(String fromStationName) {
		this.fromStationName = fromStationName;
	}

	public void setToStationName(String toStationName) {
		this.toStationName = toStationName;
	}
	
	public void setDepartureDate(Date departure, Date issuingDate){
		
		if (issuingDate == null || departure == null) return;
					
		this.travelDate = DateTimeUtils.getDateDifference(issuingDate,departure);
		this.departureTime =  DateTimeUtils.getTime(departure);
	}
	
	public void setDepartureTimeZone(Date dateLocal, Date dateUTC ) {
		// -- (UTC = local + offset * 15 Minutes)	
		this.departureUTCOffset = new Long(dateLocal.getTime() - dateUTC.getTime()) / (1000 * 60 * 15);
	}
	
	public Date getDepartureDate(Date issuingDate){
		return DateTimeUtils.getDate(issuingDate, this.travelDate, this.departureTime);
	}
	
	public Date getUTCDepartureDate(Date issuingDate){
		return DateTimeUtils.getUTCDate(issuingDate, this.travelDate, this.departureTime, this.departureUTCOffset);
	}	
	



}
