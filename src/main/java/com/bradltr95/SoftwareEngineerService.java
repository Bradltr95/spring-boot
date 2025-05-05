package com.bradltr95;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineer getSoftwareEngineersById(Integer id) {
        return softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + "not found"));
    }

    /* saveSoftwareEngineer - If the ID for the engineer that is provided
    exists in the database than an update while occur. If the ID does not exist then
    a new record will be created */
    public void saveSoftwareEngineer(SoftwareEngineer engineer) {
        softwareEngineerRepository.save(engineer);
    }

    public void deleteSoftwareEngineer(Integer id) {
        softwareEngineerRepository.deleteById(id);
    }
}
