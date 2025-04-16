package org.example.bootapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageServiceImpl implements StorageService {
    @Override
    public String upload(MultipartFile file) {
        return "";
    }
}
