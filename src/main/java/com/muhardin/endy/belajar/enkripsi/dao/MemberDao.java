package com.muhardin.endy.belajar.enkripsi.dao;

import com.muhardin.endy.belajar.enkripsi.entity.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao extends CrudRepository<Member, String> {
}
