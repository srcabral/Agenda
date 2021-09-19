package business

class ContactBusiness {

    fun validate(name: String, phone: String) {
        if (name == "") {
            throw java.lang.Exception("Nome é obrigatório!")
        }
        if (phone == "") {
            throw java.lang.Exception("Telefone é obrigatório!")
        }
    }

    fun validateDelete(name: String, phone: String) {
        if (name == "" || phone == "") {
            throw java.lang.Exception("É necessário selecionar um contato antes de remover!")
        }
    }

    fun save(name: String, phone: String) {
        validate(name, phone)
    }

    fun delete(name: String, phone: String) {
        validateDelete(name, phone)
    }
}