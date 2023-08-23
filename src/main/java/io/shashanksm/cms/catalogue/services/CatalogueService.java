package io.shashanksm.cms.catalogue.services;

import java.util.List;
import java.util.Optional;

import io.shashanksm.cms.catalogue.data.CatalogueItem;

/**
 * A contract to create CatalogueService implementations with required methods.
 * Contains basic CRUD operations with scenario specific retrieval methods. This
 * service generally caters a REST controller; a graphql server may be more
 * suited for retrieval strategies.
 * 
 * @author shashank.mutgi
 */
public interface CatalogueService {

	public Optional<CatalogueItem> createCatalogueItem();

	public Optional<CatalogueItem> findCatalogueItem(Long id);

	public List<CatalogueItem> findAllCatalogueItems(Long pageNumber, int sizeOfPage);

	public List<CatalogueItem> findCatalogueItemsByName(String name, Long pageNumber, int sizeOfPage);

	public List<CatalogueItem> findCatalogueItemsByTags(List<String> tags, Long pageNumber, int sizeOfPage);

	public Optional<CatalogueItem> updateCatalogueItem(CatalogueItem item);

	public Optional<CatalogueItem> deleteCatalogueItem(Long id);

	public Long getTotalItemCount();

}
