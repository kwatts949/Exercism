class Complement
  def self.of_dna(base)
    arr = []
    base_array = base.split("")
    base_array.each { |base|
      if base == 'C'
        arr.push('G')
      elsif base == 'G'
        arr.push('C')
      elsif base == 'T'
        arr.push('A')
      elsif base == 'A'
        arr.push('U')
      else
        ''
    end}
    arr.join(",").delete(",")
  end
end