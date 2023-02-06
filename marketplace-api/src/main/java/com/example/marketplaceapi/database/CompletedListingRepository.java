package com.example.marketplaceapi.database;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompletedListingRepository extends MongoRepository<CompletedListing, String> {
}
