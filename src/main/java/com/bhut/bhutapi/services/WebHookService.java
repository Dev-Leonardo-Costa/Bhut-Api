package com.bhut.bhutapi.services;

import com.bhut.bhutapi.dtos.CarDTO;
import com.bhut.bhutapi.models.WebHook;
import com.bhut.bhutapi.repositories.WebHookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class WebHookService {

    private final WebHookRepository webHookRepository;
    private final RestTemplate template = new RestTemplate();

    public WebHook create(String url) {
        return webHookRepository.save(new WebHook(url));
    }

    public List<WebHook> getAll() {
        return webHookRepository.findAll();
    }

    public void notifyAll(CarDTO car) {
        List<WebHook> webHooks = getAll();
        webHooks.forEach(w -> {
            template.postForObject(w.getUrl(), car, CarDTO.class);
        });
    }
}
