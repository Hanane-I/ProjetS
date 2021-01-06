package com.project.sf;

import static org.mockito.Mockito.when;
import com.project.sf.controller.CategorieController;
import com.project.sf.modele.Categorie;
import com.project.sf.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
public class TestCategorie {

    @Autowired private CategorieController categorieController;
    @MockBean @Autowired private CategorieRepository categorieRepository;

    //get
    public void getCategoriesTest(){
        when(categorieController.retrieveAllCategories()).thenReturn(Stream
        .of(new Categorie()).collect(Collectors.toList()));
    }
}
