package com.benleadbeater.database.hello.mySpringDatabaseBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.benleadbeater.database.hello.mySpringDatabaseBootApp.model.MySpringBootDataModel;

@Repository
public interface GarageRepository extends JpaRepository<MySpringBootDataModel,Long>{

}
