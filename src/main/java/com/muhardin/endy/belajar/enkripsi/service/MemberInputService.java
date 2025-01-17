package com.muhardin.endy.belajar.enkripsi.service;

import com.muhardin.endy.belajar.enkripsi.entity.Member;
import org.springframework.web.multipart.MultipartFile;

public interface MemberInputService {
    void save(Member member, MultipartFile fileKtp);
    byte[] getFileKtp(Member member);
    Iterable<Member> findAllMembers();
}
