package business

import entity.ContactEntity
import repository.ContactRepository

class ContactBusiness {

    private fun validate(name: String, phone: String) {
        if (name == "" && phone == ""){
            throw java.lang.Exception("Nome e Telefone são obrigatórios!")
        }
        if (name == "") {
            throw java.lang.Exception("Campo Nome está vazio!")
        }
        if (phone == "") {
            throw java.lang.Exception("Campo Telefone está vazio!")
        }
    }

    private fun validateDelete(name: String, phone: String) {
        if (name == "" || phone == "") {
            throw java.lang.Exception("É necessário selecionar um contato antes de remover!")
        }
    }

    fun getContactCountDescription(): String {
        val list = getlist()
        return when {
            list.isEmpty() -> "0 contatos"
            list.size == 1 -> "1 contato"
            else -> "${list.size} contatos"
        }
    }

    fun save(name: String, phone: String) {
        validate(name, phone)

        val contact = ContactEntity(name, phone)
        ContactRepository.save(contact)
    }

    fun delete(name: String, phone: String) {
        validateDelete(name, phone)

        val contact = ContactEntity(name, phone)
        ContactRepository.delete(contact)
    }

    fun getlist(): List<ContactEntity>{
        return ContactRepository.getList()
    }
}