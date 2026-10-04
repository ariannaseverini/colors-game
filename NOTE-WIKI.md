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


(sto usando l'AI per l'aiuto nell'utilizzo di arrayList, che fino ad ora non avevo mai affrontato nel codice)

## Casa (model)

**Responsabilità:** contiene un insieme di Stanza, sa dire se è
completamente colorata, e fornisce le stanze ancora attaccabili dal
ripulitore.

**Decisioni chiave:**
- Usa List<Stanza> invece di un array, per non fissare un numero
  rigido di stanze.
- getStanze() restituisce una copia superficiale (shallow copy) della
  lista: protegge la struttura interna da aggiunte/rimozioni esterne,
  ma le singole Stanza restituite restano gli oggetti veri (si possono
  ancora modificare, es. per i test).
- stanzeAttaccabili() delega la decisione a Stanza.isAttaccabile() —
  Casa non duplica quella logica, solo la usa.