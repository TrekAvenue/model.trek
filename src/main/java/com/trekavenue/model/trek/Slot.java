/**
 * 
 */
package com.trekavenue.model.trek;

import org.joda.time.DateTime;

/**
 * @author ashutosh
 *
 */
public class Slot {
	DateTime startDate;
	DateTime endDate;
	Integer totalSlots;
	Integer slotsAvailable;
	
	/**
	 * 
	 */
	public Slot() {
		super();
	}

	/**
	 * @param startDate
	 * @param endDate
	 * @param totalSlots
	 * @param slotsAvailable
	 */
	public Slot(DateTime startDate, DateTime endDate, Integer totalSlots, Integer slotsAvailable) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalSlots = totalSlots;
		this.slotsAvailable = slotsAvailable;
	}

	/**
	 * @return the startDate
	 */
	public DateTime getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public DateTime getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the totalSlots
	 */
	public Integer getTotalSlots() {
		return totalSlots;
	}

	/**
	 * @param totalSlots the totalSlots to set
	 */
	public void setTotalSlots(Integer totalSlots) {
		this.totalSlots = totalSlots;
	}

	/**
	 * @return the slotsAvailable
	 */
	public Integer getSlotsAvailable() {
		return slotsAvailable;
	}

	/**
	 * @param slotsAvailable the slotsAvailable to set
	 */
	public void setSlotsAvailable(Integer slotsAvailable) {
		this.slotsAvailable = slotsAvailable;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((slotsAvailable == null) ? 0 : slotsAvailable.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((totalSlots == null) ? 0 : totalSlots.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
		Slot other = (Slot) obj;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (slotsAvailable == null) {
			if (other.slotsAvailable != null)
				return false;
		} else if (!slotsAvailable.equals(other.slotsAvailable))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (totalSlots == null) {
			if (other.totalSlots != null)
				return false;
		} else if (!totalSlots.equals(other.totalSlots))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Slot [startDate=" + startDate + ", endDate=" + endDate + ", totalSlots=" + totalSlots
				+ ", slotsAvailable=" + slotsAvailable + "]";
	}
}
