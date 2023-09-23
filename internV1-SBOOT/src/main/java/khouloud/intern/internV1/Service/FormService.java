package khouloud.intern.internV1.Service;


import jakarta.transaction.Transactional;
import khouloud.intern.internV1.Exception.FormNotFoundException;
import khouloud.intern.internV1.Repository.FormRepository;
import khouloud.intern.internV1.Models.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class FormService {

    private final FormRepository formRepository;

    @Autowired
    public FormService(FormRepository formRepository){
        this.formRepository= formRepository;
    }

    public Form addForm (Form form){
        return formRepository.save(form);
    }

    public  Form findFormById(long id){
        return formRepository.findFormById((int)id)
                .orElseThrow(() -> new FormNotFoundException("form by id " + id + " was not found"));
    }

    public List<Form> findAllForms() {
        return formRepository.findAll();
    }
    public void  deleteForm (long id){
        formRepository.deleteFormById(id);
    }

}
