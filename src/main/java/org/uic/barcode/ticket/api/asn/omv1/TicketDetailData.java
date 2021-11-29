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
package org.uic.barcode.ticket.api.asn.omv1;



import org.uic.barcode.asn1.datatypes.Choice;
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.HasExtensionMarker;
import org.uic.barcode.ticket.api.asn.omv1.DelayConfirmation;
import org.uic.barcode.ticket.api.asn.omv1.ExtensionData;

@Choice
@HasExtensionMarker
public class TicketDetailData extends Object {
	public TicketDetailData() {
	}

	@FieldOrder(order = 0)
	public ReservationData reservation;

	@FieldOrder(order = 1)
	public CarCarriageReservationData carCarriageReservation;

	@FieldOrder(order = 2)
	public OpenTicketData openTicket;

	@FieldOrder(order = 3)
	public PassData pass;

	@FieldOrder(order = 4)
	public VoucherData voucher;

	@FieldOrder(order = 5)
	public CustomerCardData customerCard;

	@FieldOrder(order = 6)
	public CountermarkData counterMark;

	@FieldOrder(order = 7)
	public ParkingGroundData parkingGround;

	@FieldOrder(order = 8)
	public FIPTicketData fipTicket;

	@FieldOrder(order = 9)
	public StationPassageData stationPassage;

	@FieldOrder(order = 10)
	public ExtensionData extension;	
	
	@FieldOrder(order = 11)
	public DelayConfirmation delayConfirmation;

	public ReservationData getReservation() {
		
		return this.reservation;
	}
	
	public CarCarriageReservationData getCarCarriageReservation() {
		
		return this.carCarriageReservation;
	}
	
	public OpenTicketData getOpenTicket() {
		
		return this.openTicket;
	}
	
	public PassData getPass() {
		
		return this.pass;
	}
	
	public VoucherData getVoucher() {
		
		return this.voucher;
	}
	
	public CustomerCardData getCustomerCard() {
		
		return this.customerCard;
	}
	
	public CountermarkData getCounterMark() {
		
		return this.counterMark;
	}
	
	public ParkingGroundData getParkingGround() {
		
		return this.parkingGround;
	}
	
	public FIPTicketData getFipTicket() {
		
		return this.fipTicket;
	}
	
	public StationPassageData getStationPassage() {
		
		return this.stationPassage;
	}
	
	public DelayConfirmation getDelayConfirmation() {
		
		return this.delayConfirmation;
	}
	
	public ExtensionData getExtension() {
		
		return this.extension;
	}
	
	public void setReservation(ReservationData reservation) {
		
		this.reservation = reservation;
	}

	public void setCarCarriageReservation(CarCarriageReservationData carCarriageReservation) {
		
		this.carCarriageReservation = carCarriageReservation;
	}

	public void setOpenTicket(OpenTicketData openTicket) {
		
		this.openTicket = openTicket;
	}

	public void setPass(PassData pass) {
		
		this.pass = pass;
	}

	public void setVoucher(VoucherData voucher) {
		
		this.voucher = voucher;
	}

	public void setCustomerCard(CustomerCardData customerCard) {
		
		this.customerCard = customerCard;
	}

	public void setCounterMark(CountermarkData counterMark) {
		
		this.counterMark = counterMark;
	}

	public void setParkingGround(ParkingGroundData parkingGround) {
		
		this.parkingGround = parkingGround;
	}

	public void setFipTicket(FIPTicketData fipTicket) {
		
		this.fipTicket = fipTicket;
	}

	public void setStationPassage(StationPassageData stationPassage) {
		
		this.stationPassage = stationPassage;
	}

	public void setDelayConfirmation(DelayConfirmation delayConfirmation) {
		
		this.delayConfirmation = delayConfirmation;
	}

	public void setExtension(ExtensionData extension) {
		
		this.extension = extension;
	}

}
