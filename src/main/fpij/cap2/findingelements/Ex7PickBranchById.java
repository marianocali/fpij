package main.fpij.cap2.findingelements;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ex7PickBranchById {

    public static void main(String[] args) {
        Ex7PickBranchById ex7PickBranchById = new Ex7PickBranchById();
        List<BranchDTO> branches = ex7PickBranchById.getBranchesByNeighborhood(2);

                branches.stream()
                .forEach(b -> System.out.println("b.getNeighborhood().getId(): " + b.getNeighborhood().getId() + " b.getNeighborhood().getName: " + b.getNeighborhood().getName()));

        System.out.println("branches size: " + branches.size());
    }


    public List<BranchDTO> getBranchesByNeighborhood(int neighborhood) {

        List<BranchDTO> branches = new LinkedList<>();
//        System.out.println("getBranchesByNeighborhood al inicio: ");
        branches = getBranches();
//        branches.stream()
//                .forEach(b -> System.out.println("b.getNeighborhood().getId(): " + b.getNeighborhood().getId() + " b.getNeighborhood().getName: " + b.getNeighborhood().getName()));

        branches = getBranches().stream()
                .filter(branch -> Objects.nonNull(branch))
                .filter(branch -> Objects.nonNull(branch.getId()))
                .filter(branch -> branch.getNeighborhood().getId() == neighborhood)
                .collect(Collectors.toList());

//        System.out.println("\ngetBranchesByNeighborhood luego del filtrado: ");

//        branches.stream()
//                .forEach(b -> System.out.println("b.getNeighborhood().getId(): " + b.getNeighborhood().getId() + " b.getNeighborhood().getName: " + b.getNeighborhood().getName()));

        return branches;
    }

    private List<BranchDTO> getBranches(){
        final List<BranchDTO> branches = new LinkedList<>();

        NeighborhoodDTO neighborhoodDTO =
                NeighborhoodDTO.builder().withId(51l).withName("los torrentes").build();

        NeighborhoodDTO neighborhoodDT2 =
                NeighborhoodDTO.builder().withId(2l).withName("los naranjos").build();

        NeighborhoodDTO neighborhoodDT3 =
                NeighborhoodDTO.builder().withId(null).withName(null).build();


        BranchDTO branchDTO = BranchDTO.builder() //
                .withId(1) //
                .withNeighborhood(neighborhoodDTO) //
                .build();

        BranchDTO branchDTO2 = BranchDTO.builder() //
                .withId(2) //
                .withNeighborhood(neighborhoodDT2) //
                .build();

        branches.add(branchDTO);
        branches.add(branchDTO2);

//        System.out.println("getBranches: ");
//        branches.stream()
//                .forEach(b -> System.out.println("branch id: " + b.getNeighborhood().getId() + " branch name: " + b.getNeighborhood().getName()));

        return branches;

    }
}
