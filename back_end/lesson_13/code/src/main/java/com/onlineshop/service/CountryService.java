package com.onlineshop.service;

import com.onlineshop.controller.dto.CountryDTO;
import com.onlineshop.domain.Country;
import com.onlineshop.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<CountryDTO> findAll() {
        List<Country> countries = countryRepository.findAll();
        List<CountryDTO> result = new ArrayList<>();
        countries.forEach(country -> result.add(CountryDTO.getInstance(country)));
        return result;
    }

    public CountryDTO add(CountryDTO country) {
        Country newCountry = new Country();
        newCountry.setCountryName(country.getCountryName());
        newCountry = countryRepository.save(newCountry);
        return CountryDTO.getInstance(newCountry);
    }
}
