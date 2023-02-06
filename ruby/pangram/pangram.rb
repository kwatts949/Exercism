class Pangram
  def self.pangram?(sentence)
    #sorted_sentence = sentence.split('').sort.uniq.join("").strip

    sorted_sentence = sentence.downcase.scan(/[a-z]/).sort.uniq.join('')

    sorted_sentence == 'abcdefghijklmnopqrstuvwxyz'
  end
end