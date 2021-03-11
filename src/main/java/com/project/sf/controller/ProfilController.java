package com.project.sf.controller;

import com.project.sf.modele.Profil;
import com.project.sf.repository.ProfilRepository;
import com.project.sf.services.ProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/profil")
public class ProfilController {
    @Autowired private ProfilRepository profilRepository;
    @Autowired private ProfilService profilService;

    @GetMapping
    public List<Profil> getAllProfil(){
        return profilRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<?> saveProfil(@RequestBody Profil profil){
        return new ResponseEntity<>(profilService.save(profil), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteProfil(@PathVariable Long id){
        profilRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProfil(@RequestBody Profil newProfil, @PathVariable Long id){
        return new ResponseEntity<>(profilService.updateProfil(newProfil, id), HttpStatus.ACCEPTED);
    }



    @GetMapping("/{id}")
    public Profil getProfil(@PathVariable Long id){
        return profilRepository.findProfilByProfilId(id);
    }
}
