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
import java.util.List;

import org.uic.barcode.asn1.datatypes.Asn1BigInteger;
import org.uic.barcode.asn1.datatypes.Asn1Default;
import org.uic.barcode.asn1.datatypes.Asn1Optional;
import org.uic.barcode.asn1.datatypes.CharacterRestriction;
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.HasExtensionMarker;
import org.uic.barcode.asn1.datatypes.IntRange;
import org.uic.barcode.asn1.datatypes.RestrictedString;
import org.uic.barcode.asn1.datatypes.Sequence;
import org.uic.barcode.asn1.datatypesimpl.SequenceOfStringIA5;
import org.uic.barcode.ticket.api.utils.DateTimeUtils;

@Sequence
@HasExtensionMarker
public class CountermarkData extends Object {
	public CountermarkData() {
	}

	@FieldOrder(order = 0)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String referenceIA5;

	@FieldOrder(order = 1)
	@Asn1Optional public Asn1BigInteger referenceNum;

	@FieldOrder(order = 2)
	@IntRange(minValue=1,maxValue=32000)
	@Asn1Optional public Long productOwnerNum;

	@FieldOrder(order = 3)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productOwnerIA5;

	@FieldOrder(order = 4)
	@IntRange(minValue=0,maxValue=65535)
	@Asn1Optional public Long productIdNum;

	@FieldOrder(order = 5)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productIdIA5;

	@FieldOrder(order = 6)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String ticketReferenceIA5;

	@FieldOrder(order = 7)
	@Asn1Optional public Asn1BigInteger ticketReferenceNum;

	@FieldOrder(order = 8)
	@IntRange(minValue=1,maxValue=200)
	public Long numberOfCountermark;

	@FieldOrder(order = 9)
	@IntRange(minValue=1,maxValue=200)
	public Long totalOfCountermarks;

	@FieldOrder(order = 10)
	@RestrictedString(CharacterRestriction.UTF8String)
	String groupName;

	@FieldOrder(order = 11)
	@Asn1Default("stationUIC")
	@Asn1Optional public CodeTableType stationCodeTable;

	@FieldOrder(order = 12)
	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long fromStationNum;

	@FieldOrder(order = 13)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String fromStationIA5;

	@FieldOrder(order = 14)
	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long toStationNum;

	@FieldOrder(order = 15)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String toStationIA5;

	@FieldOrder(order = 16)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String fromStationNameUTF8;

	@FieldOrder(order = 17)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String toStationNameUTF8;

	@FieldOrder(order = 18)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String validRegionDesc;
	
	@FieldOrder(order = 19)
	@Asn1Optional public SequenceOfRegionalValidityType validRegion;

	@FieldOrder(order = 20)
	public Boolean returnIncluded = false;
	
	@FieldOrder(order = 21)
	@Asn1Optional public ReturnRouteDescriptionType returnDescription;

	@FieldOrder(order = 22)
	@IntRange(minValue=-367,maxValue=700)
	@Asn1Default(value = "0")
	@Asn1Optional public Long validFromDay;

	@FieldOrder(order = 23)
	@IntRange(minValue=0,maxValue=1439)
	@Asn1Optional public Long validFromTime;
	
	@FieldOrder(order = 24)
	@IntRange(minValue=-60, maxValue=60)
	@Asn1Optional public Long validFromUTCOffset;

	@FieldOrder(order = 25)
	@IntRange(minValue=-1,maxValue=370)
	@Asn1Default(value = "0")
	@Asn1Optional public Long validUntilDay;

	@FieldOrder(order = 26)
	@IntRange(minValue=0,maxValue=1439)
	@Asn1Optional public Long validUntilTime;
	
	@FieldOrder(order = 27)
	@IntRange(minValue=-60, maxValue=60)
	@Asn1Optional public Long validUntilUTCOffset;

	@FieldOrder(order = 28)
	@Asn1Default(value="second")
	@Asn1Optional public TravelClassType classCode;

	@FieldOrder(order = 29)
	@Asn1Optional public SequenceOfCarrierNum carrierNum;

	@FieldOrder(order = 30)
	@Asn1Optional public SequenceOfStringIA5 carrierIA5;

	@FieldOrder(order = 31)
	@Asn1Optional public SequenceOfServiceBrands includedServiceBrands;

	@FieldOrder(order = 32)
	@Asn1Optional public SequenceOfServiceBrands excludedServiceBrands;

	@FieldOrder(order = 33)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String infoText;

	@FieldOrder(order = 34)
	@Asn1Optional public ExtensionData extension;
	


	

	public String getReferenceIA5() {

		return this.referenceIA5;
	}

	public Long getReferenceNum() {

		return Asn1BigInteger.toLong(this.referenceNum);
	}

	public Long getProductOwnerNum() {

		return this.productOwnerNum;
	}

	public String getProductOwnerIA5() {

		return this.productOwnerIA5;
	}

	public Long getProductIdNum() {

		return this.productIdNum;
	}

	public String getProductIdIA5() {

		return this.productIdIA5;
	}

	public String getTicketReferenceIA5() {

		return this.ticketReferenceIA5;
	}

	public Long getTicketReferenceNum() {

		return Asn1BigInteger.toLong(this.ticketReferenceNum);
	}

	public Long getNumberOfCountermark() {

		return this.numberOfCountermark;
	}

	public Long getTotalOfCountermarks() {

		return this.totalOfCountermarks;
	}

	public String getGroupName() {

		return this.groupName;
	}

	public CodeTableType getStationCodeTable() {

		if (stationCodeTable == null) {
			return CodeTableType.stationUIC;
		}
		
		return this.stationCodeTable;
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

	public String getFromStationNameUTF8() {

		return this.fromStationNameUTF8;
	}

	public String getToStationNameUTF8() {

		return this.toStationNameUTF8;
	}

	public String getValidRegionDesc() {

		return this.validRegionDesc;
	}

	public SequenceOfRegionalValidityType getValidRegion() {

		return this.validRegion;
	}

	public Boolean getReturnIncluded() {

		return this.returnIncluded;
	}

	public ReturnRouteDescriptionType getReturnDescription() {

		return this.returnDescription;
	}

	public Long getValidFromDay() {

		return this.validFromDay;
	}

	public Long getValidFromTime() {

		return this.validFromTime;
	}

	public Long getValidUntilDay() {

		return this.validUntilDay;
	}

	public Long getValidUntilTime() {

		return this.validUntilTime;
	}

	public TravelClassType getClassCode() {

		if (classCode == null){
			return TravelClassType.second;
		}
		
		return this.classCode;
	}

	public SequenceOfCarrierNum getCarriersNum() {

		return this.carrierNum;
	}

	public SequenceOfStringIA5 getCarriersIA5() {

		return this.carrierIA5;
	}

	public SequenceOfServiceBrands getIncludedServiceBrands() {

		return this.includedServiceBrands;
	}

	public SequenceOfServiceBrands getExcludedServiceBrands() {

		return this.excludedServiceBrands;
	}

	public String getInfoText() {

		return this.infoText;
	}

	public ExtensionData getExtension() {

		return this.extension;
	}

	public void setReferenceIA5(String referenceIA5) {

		this.referenceIA5 = referenceIA5;
	}

	public void setReferenceNum(Long referenceNum) {

		this.referenceNum = Asn1BigInteger.toAsn1(referenceNum);
	}

	public void setProductOwnerNum(Long productOwnerNum) {

		this.productOwnerNum = productOwnerNum;
	}

	public void setProductOwnerIA5(String productOwnerIA5) {

		this.productOwnerIA5 = productOwnerIA5;
	}

	public void setProductIdNum(Long productIdNum) {

		this.productIdNum = productIdNum;
	}

	public void setProductIdIA5(String productIdIA5) {

		this.productIdIA5 = productIdIA5;
	}

	public void setTicketReferenceIA5(String ticketReferenceIA5) {

		this.ticketReferenceIA5 = ticketReferenceIA5;
	}

	public void setTicketReferenceNum(Long ticketReferenceNum) {

		this.ticketReferenceNum = Asn1BigInteger.toAsn1(ticketReferenceNum);
	}

	public void setNumberOfCountermark(Long numberOfCountermark) {

		this.numberOfCountermark = numberOfCountermark;
	}

	public void setTotalOfCountermarks(Long totalOfCountermarks) {

		this.totalOfCountermarks = totalOfCountermarks;
	}

	public void setGroupName(String groupName) {

		this.groupName = groupName;
	}

	public void setStationCodeTable(CodeTableType stationCodeTable) {

		this.stationCodeTable = stationCodeTable;
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

	public void setFromStationNameUTF8(String fromStationNameUTF8) {

		this.fromStationNameUTF8 = fromStationNameUTF8;
	}

	public void setToStationNameUTF8(String toStationNameUTF8) {

		this.toStationNameUTF8 = toStationNameUTF8;
	}

	public void setValidRegionDesc(String validRegionDesc) {

		this.validRegionDesc = validRegionDesc;
	}

	public void setValidRegion(SequenceOfRegionalValidityType validRegion) {

		this.validRegion = validRegion;
	}

	public void setReturnIncluded(Boolean returnIncluded) {

		this.returnIncluded = returnIncluded;
	}

	public void setReturnDescription(ReturnRouteDescriptionType returnDescription) {

		this.returnDescription = returnDescription;
	}

	public void setValidFromDay(Long validFromDay) {

		this.validFromDay = validFromDay;
	}

	public void setValidFromTime(Long validFromTime) {

		this.validFromTime = validFromTime;
	}

	public void setValidUntilDay(Long validUntilDay) {

		this.validUntilDay = validUntilDay;
	}

	public void setValidUntilTime(Long validUntilTime) {

		this.validUntilTime = validUntilTime;
	}

	public void setClassCode(TravelClassType classCode) {

		this.classCode = classCode;
	}

	public void setCarriersNum(SequenceOfCarrierNum carrierNum) {

		this.carrierNum = carrierNum;
	}

	public void setCarriersNum(List<Long> longs) {
		if (longs == null) return;

		this.carrierNum = new SequenceOfCarrierNum();
		this.carrierNum.addAll(longs);
	}
	
	public void setCarriersIA5(SequenceOfStringIA5 carrierIA5) { 

		this.carrierIA5 = carrierIA5;
	}

	public void setIncludedServiceBrands(SequenceOfServiceBrands includedServiceBrands) {

		this.includedServiceBrands = includedServiceBrands;
	}

	public void setExcludedServiceBrands(SequenceOfServiceBrands excludedServiceBrands) {

		this.excludedServiceBrands = excludedServiceBrands;
	}

	public void setInfoText(String infoText) {

		this.infoText = infoText;
	}

	public void setExtension(ExtensionData extension) {

		this.extension = extension;
	}
	
	
	public void setValidityDates (Date fromDate, Date untilDate, Date issuingDate){
			
		if (issuingDate == null || fromDate == null) return;
				
		this.validFromDay = DateTimeUtils.getDateDifference(issuingDate,fromDate);
		this.validFromTime =  DateTimeUtils.getTime(fromDate);

		if (untilDate != null){
			this.validUntilDay = DateTimeUtils.getDateDifference(fromDate, untilDate);
			this.validUntilTime = DateTimeUtils.getTime(untilDate);
		}

	}
	
	public Date getValidFromDate(Date issuingDate){
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay, this.validFromTime);
		
	}
	
	public Date getValidUntilDate(Date issuingDate){
		
		if (issuingDate == null) return null;
		
		if (this.validFromDay == null) {
			this.validFromDay = 0L;
		}
		
		if (this.validUntilDay == null) {
			return null;
		}		
		
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay + this.validUntilDay, this.validUntilTime);
		
	}

	public Long getValidFromUTCOffset() {
		return validFromUTCOffset;
	}

	public void setValidFromUTCOffset(Long validFromUTCOffset) {
		this.validFromUTCOffset = validFromUTCOffset;
	}

	public Long getValidUntilUTCOffset() {
		return validUntilUTCOffset;
	}

	public void setValidUntilUTCOffset(Long validUntilUTCOffset) {
		this.validUntilUTCOffset = validUntilUTCOffset;
	}
	
	

}
