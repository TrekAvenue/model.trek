/**
 * 
 */
package com.trekavenue.model.trek;

/**
 * Class to store Summary info of treks. <br> <br>
 * SummaryInfo is not being stored in the database. 
 * Instead its being generated on the fly. 
 * 
 * @author ashutosh
 *
 */
public class SummaryInfo {
	Integer startingPriceInr;
	String bannerImageUrl;
	
	/**
	 * Constructor to create empty object.
	 */
	public SummaryInfo() {
		super();
	}

	/**
	 * Constructor.
	 * @param startingPriceInr
	 * @param bannerImageUrl
	 */
	public SummaryInfo(Integer startingPriceInr, String bannerImageUrl) {
		super();
		this.startingPriceInr = startingPriceInr;
		this.bannerImageUrl = bannerImageUrl;
	}

	/**
	 * @return the startingPriceInr
	 */
	public Integer getStartingPriceInr() {
		return startingPriceInr;
	}

	/**
	 * @param startingPriceInr the startingPriceInr to set
	 */
	public void setStartingPriceInr(Integer startingPriceInr) {
		this.startingPriceInr = startingPriceInr;
	}

	/**
	 * @return the bannerImageUrl
	 */
	public String getBannerImageUrl() {
		return bannerImageUrl;
	}

	/**
	 * @param bannerImageUrl the bannerImageUrl to set
	 */
	public void setBannerImageUrl(String bannerImageUrl) {
		this.bannerImageUrl = bannerImageUrl;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bannerImageUrl == null) ? 0 : bannerImageUrl.hashCode());
		result = prime * result + ((startingPriceInr == null) ? 0 : startingPriceInr.hashCode());
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
		SummaryInfo other = (SummaryInfo) obj;
		if (bannerImageUrl == null) {
			if (other.bannerImageUrl != null)
				return false;
		} else if (!bannerImageUrl.equals(other.bannerImageUrl))
			return false;
		if (startingPriceInr == null) {
			if (other.startingPriceInr != null)
				return false;
		} else if (!startingPriceInr.equals(other.startingPriceInr))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SummaryInfo [startingPriceInr=" + startingPriceInr + ", bannerImageUrl=" + bannerImageUrl + "]";
	}
}
