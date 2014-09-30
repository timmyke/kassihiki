package viitteidenhallinta.service;


import java.util.List;

import viitteidenhallinta.model.BibTeXEntry;

public interface BibTeXStorageService {
    
    public void addEntry(BibTeXEntry entry);
    public List<BibTeXEntry> listEntries();
    public void removeEntry(Integer id);
}
