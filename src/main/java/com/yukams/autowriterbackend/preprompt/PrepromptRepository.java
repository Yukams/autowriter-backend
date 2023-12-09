package com.yukams.autowriterbackend.preprompt;

import com.yukams.autowriterbackend.production.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrepromptRepository extends JpaRepository<Preprompt, Long> { }