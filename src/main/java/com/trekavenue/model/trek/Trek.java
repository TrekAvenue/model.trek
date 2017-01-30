package com.trekavenue.model.trek;

import java.util.List;

import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;
import org.mongodb.morphia.annotations.PrePersist;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.annotations.Transient;

/**
 * Class to store Trek data.
 * 
 * @author ashutosh
 * 
 */
@Entity
@Indexes(@Index(value = "name", fields = @Field("name")))
public class Trek {
	@Id
	ObjectId _id = new ObjectId();
	String name;
	String description;
	String region;
	String country;
	Integer highestAltitudeInFeet;
	Float averageTemperatureDayMaxCelcius;
	Float averageTemperatureDayMinCelcius;
	Float averageTemperatureNightMaxCelcius;
	Float averageTemperatureNightMinCelcius;
	Boolean isActive;
	@Reference(lazy = true, ignoreMissing = true)
	List<Organizer> organizers;
	@Embedded
	List<Image> images;
	@Transient
	SummaryInfo summaryInfo;

	/**
	 * Stores the DateTime at which the object was last updated in database.
	 */
	DateTime lastUpdatedAt = new DateTime(DateTimeZone.UTC);
	/**
	 * Stores the DateTime at which the object was created in database.
	 */
	DateTime createdAt = new DateTime(DateTimeZone.UTC);

	@PrePersist
	void prePersist() {
		lastUpdatedAt = new DateTime(DateTimeZone.UTC);
	}

	/**
	 * Constructor to create empty object.
	 */
	public Trek() {
		super();
	}

	/**
	 * Constructor.
	 * 
	 * @param _id
	 * @param name
	 * @param description
	 * @param region
	 * @param country
	 * @param highestAltitudeInFeet
	 * @param averageTemperatureDayMaxCelcius
	 * @param averageTemperatureDayMinCelcius
	 * @param averageTemperatureNightMaxCelcius
	 * @param averageTemperatureNightMinCelcius
	 * @param isActive
	 * @param organizers
	 * @param images
	 * @param summaryInfo
	 * @param lastUpdatedAt
	 * @param createdAt
	 */
	public Trek(ObjectId _id, String name, String description, String region, String country,
			Integer highestAltitudeInFeet, Float averageTemperatureDayMaxCelcius, Float averageTemperatureDayMinCelcius,
			Float averageTemperatureNightMaxCelcius, Float averageTemperatureNightMinCelcius, Boolean isActive,
			List<Organizer> organizers, List<Image> images, SummaryInfo summaryInfo, DateTime lastUpdatedAt,
			DateTime createdAt) {
		super();
		this._id = _id;
		this.name = name;
		this.description = description;
		this.region = region;
		this.country = country;
		this.highestAltitudeInFeet = highestAltitudeInFeet;
		this.averageTemperatureDayMaxCelcius = averageTemperatureDayMaxCelcius;
		this.averageTemperatureDayMinCelcius = averageTemperatureDayMinCelcius;
		this.averageTemperatureNightMaxCelcius = averageTemperatureNightMaxCelcius;
		this.averageTemperatureNightMinCelcius = averageTemperatureNightMinCelcius;
		this.isActive = isActive;
		this.organizers = organizers;
		this.images = images;
		this.summaryInfo = summaryInfo;
		this.lastUpdatedAt = lastUpdatedAt;
		this.createdAt = createdAt;
	}

	/**
	 * Constructor.
	 * 
	 * @param name
	 * @param description
	 * @param region
	 * @param country
	 * @param highestAltitudeInFeet
	 * @param averageTemperatureDayMaxCelcius
	 * @param averageTemperatureDayMinCelcius
	 * @param averageTemperatureNightMaxCelcius
	 * @param averageTemperatureNightMinCelcius
	 * @param isActive
	 * @param organizers
	 * @param images
	 * @param summaryInfo
	 */
	public Trek(String name, String description, String region, String country, Integer highestAltitudeInFeet,
			Float averageTemperatureDayMaxCelcius, Float averageTemperatureDayMinCelcius,
			Float averageTemperatureNightMaxCelcius, Float averageTemperatureNightMinCelcius, Boolean isActive,
			List<Organizer> organizers, List<Image> images, SummaryInfo summaryInfo) {
		super();
		this._id = new ObjectId();
		this.name = name;
		this.description = description;
		this.region = region;
		this.country = country;
		this.highestAltitudeInFeet = highestAltitudeInFeet;
		this.averageTemperatureDayMaxCelcius = averageTemperatureDayMaxCelcius;
		this.averageTemperatureDayMinCelcius = averageTemperatureDayMinCelcius;
		this.averageTemperatureNightMaxCelcius = averageTemperatureNightMaxCelcius;
		this.averageTemperatureNightMinCelcius = averageTemperatureNightMinCelcius;
		this.isActive = isActive;
		this.organizers = organizers;
		this.images = images;
		this.summaryInfo = summaryInfo;
		this.lastUpdatedAt = new DateTime(DateTimeZone.UTC);
		this.createdAt = new DateTime(DateTimeZone.UTC);
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region
	 *            the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the highestAltitudeInFeet
	 */
	public Integer getHighestAltitudeInFeet() {
		return highestAltitudeInFeet;
	}

	/**
	 * @param highestAltitudeInFeet
	 *            the highestAltitudeInFeet to set
	 */
	public void setHighestAltitudeInFeet(Integer highestAltitudeInFeet) {
		this.highestAltitudeInFeet = highestAltitudeInFeet;
	}

	/**
	 * @return the averageTemperatureDayMaxCelcius
	 */
	public Float getAverageTemperatureDayMaxCelcius() {
		return averageTemperatureDayMaxCelcius;
	}

	/**
	 * @param averageTemperatureDayMaxCelcius
	 *            the averageTemperatureDayMaxCelcius to set
	 */
	public void setAverageTemperatureDayMaxCelcius(Float averageTemperatureDayMaxCelcius) {
		this.averageTemperatureDayMaxCelcius = averageTemperatureDayMaxCelcius;
	}

	/**
	 * @return the averageTemperatureDayMinCelcius
	 */
	public Float getAverageTemperatureDayMinCelcius() {
		return averageTemperatureDayMinCelcius;
	}

	/**
	 * @param averageTemperatureDayMinCelcius
	 *            the averageTemperatureDayMinCelcius to set
	 */
	public void setAverageTemperatureDayMinCelcius(Float averageTemperatureDayMinCelcius) {
		this.averageTemperatureDayMinCelcius = averageTemperatureDayMinCelcius;
	}

	/**
	 * @return the averageTemperatureNightMaxCelcius
	 */
	public Float getAverageTemperatureNightMaxCelcius() {
		return averageTemperatureNightMaxCelcius;
	}

	/**
	 * @param averageTemperatureNightMaxCelcius
	 *            the averageTemperatureNightMaxCelcius to set
	 */
	public void setAverageTemperatureNightMaxCelcius(Float averageTemperatureNightMaxCelcius) {
		this.averageTemperatureNightMaxCelcius = averageTemperatureNightMaxCelcius;
	}

	/**
	 * @return the averageTemperatureNightMinCelcius
	 */
	public Float getAverageTemperatureNightMinCelcius() {
		return averageTemperatureNightMinCelcius;
	}

	/**
	 * @param averageTemperatureNightMinCelcius
	 *            the averageTemperatureNightMinCelcius to set
	 */
	public void setAverageTemperatureNightMinCelcius(Float averageTemperatureNightMinCelcius) {
		this.averageTemperatureNightMinCelcius = averageTemperatureNightMinCelcius;
	}

	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the organizers
	 */
	public List<Organizer> getOrganizers() {
		return organizers;
	}

	/**
	 * @param organizers
	 *            the organizers to set
	 */
	public void setOrganizers(List<Organizer> organizers) {
		this.organizers = organizers;
	}

	/**
	 * @return the images
	 */
	public List<Image> getImages() {
		return images;
	}

	/**
	 * @param images
	 *            the images to set
	 */
	public void setImages(List<Image> images) {
		this.images = images;
	}

	/**
	 * @return the summaryInfo
	 */
	public SummaryInfo getSummaryInfo() {
		return summaryInfo;
	}

	/**
	 * @param summaryInfo
	 *            the summaryInfo to set
	 */
	public void setSummaryInfo(SummaryInfo summaryInfo) {
		this.summaryInfo = summaryInfo;
	}

	/**
	 * @return the lastUpdatedAt
	 */
	public DateTime getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	/**
	 * @param lastUpdatedAt
	 *            the lastUpdatedAt to set
	 */
	public void setLastUpdatedAt(DateTime lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	/**
	 * @return the createdAt
	 */
	public DateTime getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt
	 *            the createdAt to set
	 */
	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
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
		result = prime * result
				+ ((averageTemperatureDayMaxCelcius == null) ? 0 : averageTemperatureDayMaxCelcius.hashCode());
		result = prime * result
				+ ((averageTemperatureDayMinCelcius == null) ? 0 : averageTemperatureDayMinCelcius.hashCode());
		result = prime * result
				+ ((averageTemperatureNightMaxCelcius == null) ? 0 : averageTemperatureNightMaxCelcius.hashCode());
		result = prime * result
				+ ((averageTemperatureNightMinCelcius == null) ? 0 : averageTemperatureNightMinCelcius.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((highestAltitudeInFeet == null) ? 0 : highestAltitudeInFeet.hashCode());
		result = prime * result + ((images == null) ? 0 : images.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((lastUpdatedAt == null) ? 0 : lastUpdatedAt.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((organizers == null) ? 0 : organizers.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((summaryInfo == null) ? 0 : summaryInfo.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Trek other = (Trek) obj;
		if (_id == null) {
			if (other._id != null) {
				return false;
			}
		} else if (!_id.equals(other._id)) {
			return false;
		}
		if (averageTemperatureDayMaxCelcius == null) {
			if (other.averageTemperatureDayMaxCelcius != null) {
				return false;
			}
		} else if (!averageTemperatureDayMaxCelcius.equals(other.averageTemperatureDayMaxCelcius)) {
			return false;
		}
		if (averageTemperatureDayMinCelcius == null) {
			if (other.averageTemperatureDayMinCelcius != null) {
				return false;
			}
		} else if (!averageTemperatureDayMinCelcius.equals(other.averageTemperatureDayMinCelcius)) {
			return false;
		}
		if (averageTemperatureNightMaxCelcius == null) {
			if (other.averageTemperatureNightMaxCelcius != null) {
				return false;
			}
		} else if (!averageTemperatureNightMaxCelcius.equals(other.averageTemperatureNightMaxCelcius)) {
			return false;
		}
		if (averageTemperatureNightMinCelcius == null) {
			if (other.averageTemperatureNightMinCelcius != null) {
				return false;
			}
		} else if (!averageTemperatureNightMinCelcius.equals(other.averageTemperatureNightMinCelcius)) {
			return false;
		}
		if (country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!country.equals(other.country)) {
			return false;
		}
		if (createdAt == null) {
			if (other.createdAt != null) {
				return false;
			}
		} else if (!createdAt.equals(other.createdAt)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (highestAltitudeInFeet == null) {
			if (other.highestAltitudeInFeet != null) {
				return false;
			}
		} else if (!highestAltitudeInFeet.equals(other.highestAltitudeInFeet)) {
			return false;
		}
		if (images == null) {
			if (other.images != null) {
				return false;
			}
		} else if (!images.equals(other.images)) {
			return false;
		}
		if (isActive == null) {
			if (other.isActive != null) {
				return false;
			}
		} else if (!isActive.equals(other.isActive)) {
			return false;
		}
		if (lastUpdatedAt == null) {
			if (other.lastUpdatedAt != null) {
				return false;
			}
		} else if (!lastUpdatedAt.equals(other.lastUpdatedAt)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (organizers == null) {
			if (other.organizers != null) {
				return false;
			}
		} else if (!organizers.equals(other.organizers)) {
			return false;
		}
		if (region == null) {
			if (other.region != null) {
				return false;
			}
		} else if (!region.equals(other.region)) {
			return false;
		}
		if (summaryInfo == null) {
			if (other.summaryInfo != null) {
				return false;
			}
		} else if (!summaryInfo.equals(other.summaryInfo)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trek [_id=" + _id + ", name=" + name + ", description=" + description + ", region=" + region
				+ ", country=" + country + ", highestAltitudeInFeet=" + highestAltitudeInFeet
				+ ", averageTemperatureDayMaxCelcius=" + averageTemperatureDayMaxCelcius
				+ ", averageTemperatureDayMinCelcius=" + averageTemperatureDayMinCelcius
				+ ", averageTemperatureNightMaxCelcius=" + averageTemperatureNightMaxCelcius
				+ ", averageTemperatureNightMinCelcius=" + averageTemperatureNightMinCelcius + ", isActive=" + isActive
				+ ", organizers=" + organizers + ", images=" + images + ", summaryInfo=" + summaryInfo
				+ ", lastUpdatedAt=" + lastUpdatedAt + ", createdAt=" + createdAt + "]";
	}
}
