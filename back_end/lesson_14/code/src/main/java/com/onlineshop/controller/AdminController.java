package com.onlineshop.controller;

import com.onlineshop.controller.dto.CountryDTO;
import com.onlineshop.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Администрирование записей БД:
 * - редактирование справочника стран (countries)
 * - редактирование справочника поставшиков (suppliers)
 * - редактирование справочника покупателей (customers)
 * - редактирование справочника товаров (products)
 * - редактирование справочника магазинов (shops)
 *
 * Управление товарными запасами:
 * - оформление поставки товара в магазин(ы)
 * - оформление отгрузки товара покупателю согласно заказу
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country/all")
    private List<CountryDTO> findAll() {
        return countryService.findAll();
    }

    @PostMapping("/country/add")
    public CountryDTO addCountry(@RequestBody CountryDTO country) {
        return countryService.add(country);
    }

    @PutMapping("/country/update/{id}")
    public CountryDTO updateCountry(@RequestBody CountryDTO country, @PathVariable Integer id) {
        return countryService.update(id, country);
    }

    @DeleteMapping("/country/delete/{id}")
    public CountryDTO deleteCountry(@PathVariable Integer id) {
        return countryService.delete(id);
    }
}
