export class CertificationDTO {

    constructor(id: number, name: string, title: string, category: string) {
        this.id = id
        this.title = title
        this.category = category
    }

    id: number
    title: string
    category: string
}