package io.shashanksm.cms.catalogue.data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Simple data class for storing catalogue-item.
 * 
 * 
 * @author Default User
 *
 */
public class CatalogueItem {
	
	private Long id;
	
	private String name;
	
	private String description;
	
	private Double price;
	
	private LocalDateTime created;
	
	private List<String> tags;
	
	private Map<String, String> properties;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatalogueItem other = (CatalogueItem) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "CatalogueItem [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
		  + ", created=" + created + ", tags=" + tags + ", properties=" + properties + "]";
	}

	public CatalogueItem() {
		super();
	}

	public CatalogueItem(Long id, String name, String description, Double price, LocalDateTime created, List<String> tags,
	  Map<String, String> properties) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.created = created;
		this.tags = tags;
		this.properties = properties;
	}
	
}
