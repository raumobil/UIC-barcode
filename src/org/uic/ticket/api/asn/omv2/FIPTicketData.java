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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import net.gcdc.asn1.datatypes.Asn1BigInteger;
import net.gcdc.asn1.datatypes.Asn1Default;
import net.gcdc.asn1.datatypes.Asn1Optional;
import net.gcdc.asn1.datatypes.CharacterRestriction;
import net.gcdc.asn1.datatypes.IntRange;
import net.gcdc.asn1.datatypes.RestrictedString;
import net.gcdc.asn1.datatypesimpl.SequenceOfStringIA5;

public class FIPTicketData extends Object {
	public FIPTicketData() {
	}

	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String referenceIA5;

	@Asn1Optional public Asn1BigInteger referenceNum;

	@IntRange(minValue=1,maxValue=32000)
	@Asn1Optional public Long productOwnerNum;

	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productOwnerIA5;

	@IntRange(minValue=0,maxValue=65535)
	@Asn1Optional public Long productIdNum;

	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productIdIA5;

	@IntRange(minValue=-1,maxValue=700)
	@Asn1Optional public Long validFromDay;

	@IntRange(minValue=0,maxValue=370)
	@Asn1Optional public Long validUntilDay;

	@Asn1Optional public SequenceOfActivatedDays activatedDay;

	@Asn1Optional public SequenceOfCarrierNum carrierNum;

	@Asn1Optional public SequenceOfStringIA5 carrierIA5;

	@IntRange(minValue=1,maxValue=200)
	public Long numberOfTravelDays;

	public Boolean includesSupplements = false;

	@Asn1Default(value="second")
	@Asn1Optional public TravelClassType classCode;

	@Asn1Optional public ExtensionData extension;
	
	public String getReferenceIA5() {

		return this.referenceIA5;
	}

	public Asn1BigInteger getReferenceNum() {

		return this.referenceNum;
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

	public Long getValidFromDay() {

		return this.validFromDay;
	}

	public Long getValidUntilDay() {

		return this.validUntilDay;
	}

	public List<Long> getActivatedDay() {

		return this.activatedDay;
	}

	public List<Long> getCarrierNum() {

		return this.carrierNum;
	}

	public List<String> getCarrierIA5() {

		return this.carrierIA5;
	}

	public Long getNumberOfTravelDays() {

		return this.numberOfTravelDays;
	}

	public Boolean getIncludesSupplements() {

		return this.includesSupplements;
	}

	public TravelClassType getClassCode() {
		if (classCode == null) return TravelClassType.second;		
		return this.classCode;
	}

	public ExtensionData getExtension() {

		return this.extension;
	}

	public void setReferenceIA5(String referenceIA5) {

		this.referenceIA5 = referenceIA5;
	}

	public void setReferenceNum(Asn1BigInteger referenceNum) {

		this.referenceNum = referenceNum;
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

	public void setValidFromDay(Long validFromDay) {

		this.validFromDay = validFromDay;
	}

	public void setValidUntilDay(Long validUntilDay) {

		this.validUntilDay = validUntilDay;
	}

	public void setActivatedDay(SequenceOfActivatedDays activatedDay) {

		this.activatedDay = activatedDay;
	}

	public void setCarrierNum(SequenceOfCarrierNum carrierNum) {

		this.carrierNum = carrierNum;
	}

	public void setCarrierIA5(SequenceOfStringIA5 carrierIA5) {

		this.carrierIA5 = carrierIA5;
	}

	public void setNumberOfTravelDays(Long numberOfTravelDays) {

		this.numberOfTravelDays = numberOfTravelDays;
	}

	public void setIncludesSupplements(Boolean includesSupplements) {

		this.includesSupplements = includesSupplements;
	}

	public void setClassCode(TravelClassType classCode) {
		this.classCode = classCode;
	}

	public void setExtension(ExtensionData extension) {

		this.extension = extension;
	}
	
	public void setValidityDates (Date fromDate, Date untilDate, Date issuingDate){
		
		if (issuingDate == null || fromDate == null) return;
				
		this.validFromDay = DateTimeUtils.getDateDifference(issuingDate,fromDate);
		
		if (untilDate != null){
			this.validUntilDay = DateTimeUtils.getDateDifference(fromDate, untilDate);
		}

	}
	
	public Date getValidFromDate(Date issuingDate){
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay,null);
		
	}
	
	public Date getValidUntilDate(Date issuingDate){
		
		if (issuingDate == null) return null;
		
		if (this.validFromDay == null) {
			this.validFromDay = 0L;
		}
		
		if (this.validUntilDay == null) {
			return null;
		}		
		
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay + this.validUntilDay, null);
		
	}
	
	public void setActivatedDays(Collection<Date> dates, Date issuingDate){
		
		if (this.activatedDay != null) {
			this.activatedDay.clear();
		} else {
			this.activatedDay= new SequenceOfActivatedDays();
		}
		
		if (dates != null && !dates.isEmpty()) {
			
			for (Date day : dates) {
				this.addActivatedDay(issuingDate, day);
			}
			
		}
		
	}
	
	public void addActivatedDay(Date issuingDate, Date day){
		
		Long dayDiff = DateTimeUtils.getDateDifference(issuingDate, day);
		
		if (this.activatedDay == null) {
			this.activatedDay = new SequenceOfActivatedDays();
		}
		
		if (dayDiff != null) {
			this.activatedDay.add(dayDiff);
		}
		
	}
	
	public Collection<Date> getActivatedDays(Date issuingDate) {
		
		if (this.activatedDay == null) return null;
		
		ArrayList<Date> dates = new ArrayList<Date>();
		
		for (Long diff: this.getActivatedDay()) {
			
			Date day = DateTimeUtils.getDate(issuingDate, diff, null);
			
			if (day != null) {
				dates.add(day);
			}
			
		}
				
		return dates;
		
	}	
	
	
}
