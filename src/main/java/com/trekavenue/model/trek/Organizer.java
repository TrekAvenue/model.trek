package com.trekavenue.model.trek;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;

@Entity
@Indexes(@Index(value = "name", fields = @Field("name")))
public class Organizer {
	@Id
	ObjectId _id = new ObjectId();
	String name;
	Integer priceInr;
	Integer durationDays;
	String bookingLink;
	@Embedded
	List<Slot> slots;
	List<String> itinerary;

	/**
	 * 
	 */
	public Organizer() {
		super();
	}

	/**
	 * @param _id
	 * @param name
	 * @param priceInr
	 * @param durationDays
	 * @param bookingLink
	 * @param slots
	 * @param itinerary
	 */
	public Organizer(ObjectId _id, String name, Integer priceInr, Integer durationDays, String bookingLink,
			List<Slot> slots, List<String> itinerary) {
		super();
		this._id = _id;
		this.name = name;
		this.priceInr = priceInr;
		this.durationDays = durationDays;
		this.bookingLink = bookingLink;
		this.slots = slots;
		this.itinerary = itinerary;
	}

	/**
	 * @param name
	 * @param priceInr
	 * @param durationDays
	 * @param bookingLink
	 * @param slots
	 * @param itinerary
	 */
	public Organizer(String name, Integer priceInr, Integer durationDays, String bookingLink, List<Slot> slots,
			List<String> itinerary) {
		super();
		this._id = new ObjectId();
		this.name = name;
		this.priceInr = priceInr;
		this.durationDays = durationDays;
		this.bookingLink = bookingLink;
		this.slots = slots;
		this.itinerary = itinerary;
	}

	/**
	 * @return the _id
	 */
	public ObjectId get_id() {
		return _id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the priceInr
	 */
	public Integer getPriceInr() {
		return priceInr;
	}

	/**
	 * @param priceInr
	 *            the priceInr to set
	 */
	public void setPriceInr(Integer priceInr) {
		this.priceInr = priceInr;
	}

	/**
	 * @return the durationDays
	 */
	public Integer getDurationDays() {
		return durationDays;
	}

	/**
	 * @param durationDays
	 *            the durationDays to set
	 */
	public void setDurationDays(Integer durationDays) {
		this.durationDays = durationDays;
	}

	/**
	 * @return the bookingLink
	 */
	public String getBookingLink() {
		return bookingLink;
	}

	/**
	 * @param bookingLink
	 *            the bookingLink to set
	 */
	public void setBookingLink(String bookingLink) {
		this.bookingLink = bookingLink;
	}

	/**
	 * @return the slots
	 */
	public List<Slot> getSlots() {
		return slots;
	}

	/**
	 * @param slots
	 *            the slots to set
	 */
	public void setSlots(List<Slot> slots) {
		this.slots = slots;
	}

	/**
	 * @return the itinerary
	 */
	public List<String> getItinerary() {
		return itinerary;
	}

	/**
	 * @param itinerary
	 *            the itinerary to set
	 */
	public void setItinerary(List<String> itinerary) {
		this.itinerary = itinerary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_id == null) ? 0 : _id.hashCode());
		result = prime * result + ((bookingLink == null) ? 0 : bookingLink.hashCode());
		result = prime * result + ((durationDays == null) ? 0 : durationDays.hashCode());
		result = prime * result + ((itinerary == null) ? 0 : itinerary.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((priceInr == null) ? 0 : priceInr.hashCode());
		result = prime * result + ((slots == null) ? 0 : slots.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organizer other = (Organizer) obj;
		if (_id == null) {
			if (other._id != null)
				return false;
		} else if (!_id.equals(other._id))
			return false;
		if (bookingLink == null) {
			if (other.bookingLink != null)
				return false;
		} else if (!bookingLink.equals(other.bookingLink))
			return false;
		if (durationDays == null) {
			if (other.durationDays != null)
				return false;
		} else if (!durationDays.equals(other.durationDays))
			return false;
		if (itinerary == null) {
			if (other.itinerary != null)
				return false;
		} else if (!itinerary.equals(other.itinerary))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (priceInr == null) {
			if (other.priceInr != null)
				return false;
		} else if (!priceInr.equals(other.priceInr))
			return false;
		if (slots == null) {
			if (other.slots != null)
				return false;
		} else if (!slots.equals(other.slots))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Organizer [_id=" + _id + ", name=" + name + ", priceInr=" + priceInr + ", durationDays=" + durationDays
				+ ", bookingLink=" + bookingLink + ", slots=" + slots + ", itinerary=" + itinerary + "]";
	}
}
