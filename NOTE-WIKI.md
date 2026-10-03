# Note per la Wiki (bozza di lavoro)

## Stanza (model)

**Responsabilità:** rappresenta una singola stanza di una Casa. Gestisce
il proprio livello di colorazione (0-100) e sa se può ancora essere
attaccata dal ripulitore.

**Decisioni chiave:**
- Una stanza che raggiunge il 100% diventa "completata" e immune: il
  ripulitore non può più toglierle colore. Rende il completamento di
  una stanza una conquista permanente.
- aggiungiColorazione/riduciColorazione validano l'input (eccezione su
  valori negativi) e usano Math.min/Math.max per restare sempre nel
  range 0-100.
- Nessuna dipendenza da altre classi: Stanza non sa nulla di Casa,
  Personaggio o Ripulitore — è una classe di dominio "pura".